package Shapes;

import java.util.Scanner;

public class hinhtron extends hinhhoc {
    public float bankinh;

    public hinhtron() {
        ten = "Hinh tron";
    }

    public void nhapbankinh() {
        System.out.println("Ban kinh = ");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();
    }

    public void tinhchuvi() {
        chuvi = 2 * PI * bankinh;
    }

    public void tinhdientich() {
        dientich = PI * bankinh * bankinh;
    }
}