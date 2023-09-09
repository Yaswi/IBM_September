import java.util.Scanner;

abstract class Shape {
    public abstract void display();
}

class LeftAlignedTriangle extends Shape {
    private int n;

    public LeftAlignedTriangle(int n) {
        this.n = n;
    }
    @Override
    public void display() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class HollowLeftAlignedTriangle extends Shape {
    private int n;

    public HollowLeftAlignedTriangle(int n) {
        this.n = n;
    }

    @Override
    public void display() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class InvertedLeftAlignedTriangle extends Shape {
    private int n;

    public InvertedLeftAlignedTriangle(int n) {
        this.n = n;
    }

    @Override
    public void display() {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class InvertedHollowLeftAlignedTriangle extends Shape{
    private int n;
    public InvertedHollowLeftAlignedTriangle(int n){
        this.n=n;
    }
    @Override
    public void display(){
        for(int i=0;i<n;i++){
	        for(int j=0;j<i;j++){
	            System.out.print("  ");
	        }
	        for(int k=n-i;k>0;k--){
	            if(k==(n-i) || k==1 || i==0)
	                System.out.print("* ");
	           else{
	               System.out.print("  ");
	           }
	        }
	        System.out.println();

	    }
    }
}

class RightAlignedTriangle extends Shape {
    private int n;

    public RightAlignedTriangle(int n) {
        this.n = n;
    }
    @Override
    public void display() {
        for(int i=0;i<n;i++){
	        for(int j=0;j<n-i-1;j++){
	            System.out.print("  ");
	        }
	        for(int k=0;k<=i;k++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
    }
}

class HollowRightAlignedTriangle extends Shape {
    private int n;

    public HollowRightAlignedTriangle(int n) {
        this.n = n;
    }

    @Override
    public void display() {
        for(int i=0;i<n;i++){
	        for(int j=0;j<n-i-1;j++){
	            System.out.print("  ");
	        }
	        for(int k=0;k<=i;k++){
	            if(k==0 || k==i || i==(n-1))
	                System.out.print("* ");
	            else{
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
    }
}

class InvertedRightAlignedTriangle extends Shape {
    private int n;

    public InvertedRightAlignedTriangle(int n) {
        this.n = n;
    }

    @Override
    public void display() {
        for(int i=0;i<n;i++){
	        for(int j=0;j<i;j++){
	            System.out.print("  ");
	        }
	        for(int k=n-i;k>0;k--){
	            System.out.print("* ");
	        }
	        System.out.println();

	    }
    }
}

class InvertedHollowRightAlignedTriangle extends Shape{
    private int n;
    public InvertedHollowRightAlignedTriangle(int n){
        this.n=n;
    }
    @Override
    public void display(){
        for(int i=0;i<n;i++){
	        for(int j=0;j<i;j++){
	            System.out.print("  ");
	        }
	        for(int k=n-i;k>0;k--){
	            if(k==(n-i) || k==1 || i==0)
	                System.out.print("* ");
	           else{
	               System.out.print("  ");
	           }
	        }
	        System.out.println();

	    }

	    }
    }

class Rectangle extends Shape{
    private int l;
    private int b;
    public Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    @Override
    public void display(){
        for(int i=0;i<l;i++){
            for(int j=0;j<b;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class HollowRectangle extends Shape{
    private int l;
    private int b;
    public HollowRectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    @Override
    public void display(){
        for(int i=0;i<l;i++){
            for(int j=0;j<b;j++){
                if(i==0 || j==0 || i==(l-1) || j==(b-1))
                    System.out.print("* ");
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class Square extends Rectangle{
    // I believe there no need to define n, cause it wont be used even if i declare.
    public Square(int n){
        super(n,n); // Since rectangle has 2, we took the 2 values, and we are trying to invoke the values of the parent class.
    }
}

class HollowSquare extends HollowRectangle{
    public HollowSquare(int n) {
        super(n, n);
    } 
}

class Triangle extends Shape{
    private int n; 
    public Triangle(int n){
        this.n=n;
    }
    @Override
    public void display(){
        for(int i=0;i<n;i++){
	        for(int j=0;j<(n-i);j++){
	            System.out.print(" ");
	        }
	        for(int k=0;k<(2*i+1);k++){
	            System.out.print("*");
	        }
	       System.out.println();
	    }
    }

}

class HollowTriangle extends Shape{
    private int n;
    public HollowTriangle(int n){
        this.n=n;
    }
    @Override
    public void display(){
        for(int i=0;i<n;i++){
	        for(int j=0;j<(n-i);j++){
	            System.out.print(" ");
	        }
	        for(int k=0;k<(2*i+1);k++){
	            if(k==0 || k==(2*i) || i==(n-1)){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	       System.out.println();
	    }
    }
}

class InvertedTriangle extends Shape{
    private int n;
    public InvertedTriangle(int n){
        this.n=n;
    }
    @Override
    public void display(){
        for(int i=n;i>=0;i--){
	        for(int j=0;j<(n-i);j++){
	            System.out.print(" ");
	        }
	        for(int k=(2*i+1);k>0;k--){
	            System.out.print("*");
	        }
	        
	       System.out.println();
	    }

    }
}

class InvertedHollowTriangle extends Shape{
    private int n;
    public InvertedHollowTriangle(int n){
        this.n=n;
    }
    @Override
    public void display(){
        for(int i=n;i>=0;i--){
	        for(int j=0;j<(n-i);j++){
	            System.out.print(" ");
	        }
	        for(int k=(2*i+1);k>0;k--){
	            if(k==(2*i+1) || k==1 || i==n )
	                System.out.print("*");
	           else{
	               System.out.print(" ");
	           }
	        }
	       System.out.println();
	    }
    }
}

class Rhombus extends Shape{
    private int n;
    private int num=(int)n/2;
    public Rhombus(int n){
        this.n=n;
    }
    @Override
    public void display(){
        Triangle upper=new Triangle(num);
        InvertedTriangle lower=new InvertedTriangle(num);
        upper.display();
        lower.display();
    }
}
class HollowRhombus extends Shape{
    private int n;
    private int num=(int)n/2;
    public HollowRhombus(int n){
        this.n=n;
    }
    @Override
    public void display(){
        for(int i=0;i<num;i++){
	            for(int j=0;j<(num-i);j++){
	                System.out.print(" ");
	            }
	            for(int k=0;k<(2*i+1);k++){
	                if(k==0 || k==(2*i))
	                    System.out.print("*");
	                else{
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	   for(int i=num;i>=0;i--){
	       for(int j=0;j<(num-i);j++){
	           System.out.print(" ");
	       }
	       for(int k=(2*i+1);k>0;k--){
	           if(k==(2*i+1) || k==1)
	                System.out.print("*");
	           else{
	               System.out.print(" ");
	           }
	       }
	       System.out.println();
	    }
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Right-aligned Triangle");
            System.out.println("2. Hollow Right-aligned Triangle");
            System.out.println("3. Inverted Right-aligned Triangle");
            System.out.println("4.Inverted Hollow Right aligned Triangle");
            System.out.println("5. Right-aligned Triangle");
            System.out.println("6. Hollow Right-aligned Triangle");
            System.out.println("7. Inverted Right-aligned Triangle");
            System.out.println("8.Inverted Hollow Right aligned Triangle");
            System.out.println("9. Rectangle");
            System.out.println("10.Hollow rectangle");
            System.out.println("11. Square");
            System.out.println("12.Hollow Sqaure");
            System.out.println("13.Triangle");
            System.out.println("14. Hollow Triangle");
            System.out.println("15. Inverted Triangle");
            System.out.println("16. Inverted Hollow Triangle");
            System.out.println("17.Rhombus");
            System.out.println("18. Hollow Rhombus");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                case 1:
                    System.out.println("Enter the number of Lines");
                    int n=sc.nextInt();
                    RightAlignedTriangle ra=new RightAlignedTriangle(n);
                    ra.display();
                    break;
                case 2:
                    System.out.println("Enter the number of Lines");
                    n=sc.nextInt();
                    HollowRightAlignedTriangle ira=new HollowRightAlignedTriangle(n);
                    ira.display();
                    break;
                case 3:
                System.out.println("Enter the number of Lines");
                    n=sc.nextInt();
                    InvertedRightAlignedTriangle ihra=new InvertedRightAlignedTriangle(n);
                    ihra.display();
                    break;
                case 4:
                System.out.println("Enter the number of Lines");
                    n=sc.nextInt();
                    InvertedHollowRightAlignedTriangle hira =new InvertedHollowRightAlignedTriangle(n);
                    hira.display();
                    break;
                case 5:
                    System.out.println("Enter the number of Lines");
                    n=sc.nextInt();
                    LeftAlignedTriangle la=new LeftAlignedTriangle(n);
                    la.display();
                    break;
                case 6:
                    System.out.println("Enter the number of Lines");
                    n=sc.nextInt();
                    HollowLeftAlignedTriangle ila=new HollowLeftAlignedTriangle(n);
                    ila.display();
                    break;
                case 7:
                System.out.println("Enter the number of Lines");
                    n=sc.nextInt();
                    InvertedLeftAlignedTriangle ihla=new InvertedLeftAlignedTriangle(n);
                    ihla.display();
                    break;
                case 8:
                System.out.println("Enter the number of Lines");
                    n=sc.nextInt();
                    InvertedHollowRightAlignedTriangle hila =new InvertedHollowRightAlignedTriangle(n);
                    hila.display();
                    break;
                case 9:
                    System.out.println("Enter the length and width");
                    int l=sc.nextInt();
                    int b=sc.nextInt();
                    Rectangle r=new Rectangle(l, b);
                    r.display();
                    break;
                case 10:
                    System.out.println("Enter the length and width");
                    l=sc.nextInt();
                    b=sc.nextInt();
                    HollowRectangle hr=new HollowRectangle(l, b);
                    hr.display();
                    break;
                case 11:
                    System.out.println("Enter the side length");
                    n=sc.nextInt();
                    Square s=new Square(n);
                    s.display();
                    break;
                case 12:
                    System.out.println("Enter the length");
                    n=sc.nextInt();
                    HollowSquare hs=new HollowSquare(n);
                    hs.display();
                    break;
                case 13:
                    System.out.println("Enter the number of lines");
                    n=sc.nextInt();
                    Triangle t=new Triangle(n);
                    t.display();
                    break;
                case 14:
                    System.out.println("Enter the number of lines");
                    n=sc.nextInt();
                    HollowTriangle ht=new HollowTriangle(n);
                    ht.display();
                    break;
                case 15:
                    System.out.println("Enter the number of lines");
                    n=sc.nextInt();
                    InvertedTriangle it=new InvertedTriangle(n);
                    it.display();
                    break;
                case 16:
                    System.out.println("Enter the number of lines");
                    n=sc.nextInt();
                    InvertedHollowTriangle iht=new InvertedHollowTriangle(n);
                    iht.display();
                    break;
                case 17:
                    System.out.println("Enter the number of lines");
                    n=sc.nextInt();
                    Rhombus rho=new Rhombus(n);
                    rho.display();
                    break;
                case 18:
                    System.out.println("Enter the number of lines");
                    n=sc.nextInt();
                    HollowRhombus hrho=new HollowRhombus(n);
                    hrho.display();
                    break;
                default:
                    System.out.println("Please choose the options from the above");       
            }
    }
}

}
