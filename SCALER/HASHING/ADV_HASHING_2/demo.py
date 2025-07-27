import requests # type: ignore
import json

# Your Perplexity API key (DO NOT share publicly!)
API_KEY = "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"

# Function to generate a professional bio
def generate_bio(prompt):
    url = "https://api.perplexity.ai/chat/completions"

    headers = {
        "Authorization": f"Bearer {API_KEY}",
        "Content-Type": "application/json"
    }

    data = {
        "model": "llama-3-sonar-medium-32k",  # You can change to large/small
        "messages": [
            {
                "role": "system",
                "content": "You are an assistant that writes high-quality, professional and creative bios for alumni."
            },
            {
                "role": "user",
                "content": prompt
            }
        ]
    }

    response = requests.post(url, headers=headers, json=data)

    if response.status_code == 200:
        result = response.json()
        message = result['choices'][0]['message']['content']
        return message
    else:
        print("Error:", response.status_code)
        print(response.text)
        return None

# 🎯 Example usage
if __name__ == "__main__":
    user_input = input("Describe yourself to generate a bio (e.g. 'React dev from IIT Bombay...'):\n> ")
    bio = generate_bio(f"Generate a professional alumni bio for: {user_input}")
    if bio:
        print("\n🧠 AI-Generated Bio:\n")
        print(bio)
