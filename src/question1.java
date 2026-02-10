public class question1 {
    public String reverse(String name){
        StringBuilder stringBuilder  = new StringBuilder();
        stack s1 = new stack(name.length());
        for(int i =0; i<name.length(); i++){
            s1.push(name.charAt(i));
        }
        while(!s1.isEmpty()){
            stringBuilder.append((char) s1.pop());
        }
        return stringBuilder.toString();
    }
}
