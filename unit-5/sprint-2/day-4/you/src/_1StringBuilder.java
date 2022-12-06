public class _1StringBuilder {
    public static void main(String[] args) {
        String lastStation="RC";
        lastStation="SOS";

        //Alternatives to Strings when the data isn.t immutable
        StringBuilder stringBuilder;
        StringBuffer stringBuffer;
        StringBuilder builder =new StringBuilder("this is string builder");
        builder.append("added to the end");
        System.out.println(builder.toString());
        StringBuilder builder1=new StringBuilder();
        // reassign
        builder1=builder;
        builder1.compareTo(builder);


    }
}
