public class YeshBanner {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", "*","*","*","*","*","*","*","*","*","*"),
                String.join("", "*"," ","O","O","P","S"," ","A","P","P"," ","*"),
                String.join("", "*"," ","B","A","N","N","E","R"," "," ","*"),
                String.join("", "*"," ","U","C","5"," ","-"," ","J","A","V","A"," ","*"),
                String.join("", "*"," ","A","R","R","A","Y"," ","I","N","I","T"," ","*"),
                String.join("", "*"," ","S","T","R","I","N","G",".","J","O","I","N"," ","*"),
                String.join("", "*","*","*","*","*","*","*","*","*","*")
        };

        for(String line : banner) {
            System.out.println(line);
        }
    }
}