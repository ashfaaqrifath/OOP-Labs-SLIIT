class CubeCalculator {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java CubeVolumeCalculator <height> <width> <length>");
            return;
        }

        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);
        double length = Double.parseDouble(args[2]);

        double volume = height * width * length;

        System.out.println("Volume of the cube: " + volume);
    }
}