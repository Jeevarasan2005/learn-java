public class stringbuf {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("cyber");
        sb.append("security");
        System.out.println("After append: " + sb);
        sb.insert(4,"hi");
        System.out.println("after insert:" +sb);
        sb.delete(4,7);
        System.out.println("After delete:" +sb);
        sb.replace(8,13,"kali");
        System.out.println("after replace:" +sb);
        sb.reverse();
        System.out.println("After reverse:" +sb);
   
   
    }

}
