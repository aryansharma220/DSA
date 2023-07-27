public class Quadratic_root {
    public static void main(String[] args) {
        int a=1,b=-2,c=1;
        double rootDet = Math.pow(b,2)-4*a*c;
        double Det = Math.sqrt(rootDet);
        int root1 = (int)(-b + Det)/(2*a);
        int root2 = (int)(-b - Det)/(2*a);
        // System.out.println(Det);
        System.out.println(Math.max(root1,root2)+", "+Math.min(root1,root2));
    }
}
