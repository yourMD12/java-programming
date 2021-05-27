package day22_string_manipulation;

public class IndexOfEx {
    public static void main( String [] args ){

        String technologies = " java, html, css, selenium, testng, maven, cucumber";
       // first comma
        System.out.println(technologies.indexOf(",")); // 4 number of place 0123..
        //last comma
        System.out.println(technologies.lastIndexOf(",")); // 41
        //for middle , we need to loop
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);

        int idxOfCss = technologies.indexOf("css"); //12
        System.out.println("css is at index " +idxOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfCucumber);

        int idxOfSql = technologies.indexOf("sql");
        System.out.println("sql is at index " + idxOfSql); // -1

        //technologies contains maven?
        if(technologies.contains("maven")){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
        if(technologies.indexOf("maven") >-1){
            System.out.println("maven is not found");
        }else{
            System.out.println("maven is found");
        }







    }
}
