package day23_string_manipulation_while_loop;

public class SMSmessage {
    public static void main(String[] args) {

        String message = "sender: [  Saim   ] from number <222-333-44-55> message:{hello, lets code some java}";
        //substring, indexOf([],<>,{})
        //String sender, mobile,text;
       // String sender = "Nadir";
       // mobile = "2223334455";
       // text = "hello, lets code some java";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start + 1,end ));;// nadir
        String sender = message.substring(start + 1,end);
        System.out.println("sender = " + sender);
        String mobile = message.substring( message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("mobile = " + mobile);
        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);

        System.out.println("   fikret    ".trim()); //delete all side-spaces
        sender = sender.trim();
        if(sender.equals("Saim")){
            System.out.println("message from Saim about homework");
        }else{
            System.out.println("someone else message");
        }
        







    }
}
