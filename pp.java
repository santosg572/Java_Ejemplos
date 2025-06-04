public class pp { 
    public static void main(String[] args) { 
	Harmonic h = new Harmonic();
        for (int i = 0; i < args.length; i++) {
            int arg = Integer.parseInt(args[i]);
            double value = h.hh(arg);
            System.out.println(value);
        }
    }

}


