class CelsiusFahrenheit {
    public static void main(String[] args) {
        
        if (args.length < 1) {
            System.out.println("Usage: java CelsiusToFahrenheit <temperature in Celsius>");
            return;
        }

        int celsius = Integer.parseInt(args[0]);

        double fahrenheit = 1.8 * celsius + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}

