class Dec2Binary {
    public static String convert2Binary(int num) {
        if (num == 0) return "0";  // Handle edge case when input is 0
        
        StringBuilder res = new StringBuilder();

        while (num > 0) {
            res.append(num % 2);  // Append remainder (0 or 1)
            num /= 2;  // Divide number by 2
        }

        return res.reverse().toString();  // Reverse to get the correct binary representation
    }

    public static int convert2Decimal(String num) {
        int decimal = 0;
        int power = 0;
    
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) == '1') {  // Check if bit is '1'
                decimal += Math.pow(2, power); 
            }
            power++;
        }
    
        return decimal;
    }
    

    public static void main(String[] args) {
        int num = 13;
        String res = convert2Binary(num);
        System.out.println("Binary Equivalent is: " + convert2Binary(num));
        System.out.println("Decimal Equivalent is: " + convert2Decimal(res));
    }
}
