package assignment7_cs_303_ois_lenhatanh3696;

import java.util.Scanner;

public class Assignment7_CS_303_OIS_LeNhatAnh3696 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float[] mang = null;
        int luaChon;
//=======================================================================//
        do {
            System.out.println("================================");
            System.out.println("Chon tuy chon:");
            System.out.println("1. Nhap mang so thuc");
            System.out.println("2. Xuat mang");
            System.out.println("3. Tim gia tri lon thu 2");
            System.out.println("4. Xoa phan tu le");
            System.out.println("5. Thoat");
            System.out.println("================================");
            System.out.print("Nhap lua chon (1-5): ");
            luaChon = scanner.nextInt();

            switch (luaChon) {

//=======================================================================//
                case 1:
                    System.out.print("Nhap so luong phan tu: ");
                    int n = scanner.nextInt();
                    mang = new float[n];
                    mang = NhapMang(mang);
                    break;

//=======================================================================//
                case 2:
                    if (mang != null) {
                        System.out.println("Mang hien tai:");
                        XuatMang(mang);
                    } else {
                        System.out.println("Mang chua duoc nhap.");
                    }
                    break;

//=======================================================================//
                case 3:
                    if (mang != null) {
                        float max2 = TimMax2(mang);
                        if (max2 != -1) {
                            System.out.println("Gia tri lon thu 2: " + max2);
                        }
                    } else {
                        System.out.println("Mang chua duoc nhap.");
                    }
                    break;

//=======================================================================//
                case 4:
                    if (mang != null) {
                        mang = XoaPhanTuLe(mang);
                        System.out.println("Mang sau khi xoa phan tu le:");
                        XuatMang(mang);
                    } else {
                        System.out.println("Mang chua duoc nhap.");
                    }
                    break;

//=======================================================================//
                case 5:
                    System.out.println("Thoat chuong trinh...");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
            }

        } while (luaChon != 5);

    }

//=======================================================================//
    public static float[] NhapMang(float[] mang) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mang.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            mang[i] = scanner.nextFloat();
        }
        return mang;
    }

//=======================================================================//
    public static void XuatMang(float[] mang) {
        for (float num : mang) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

//=======================================================================//
    public static float TimMax2(float[] mang) {
        
        float max1 = Float.NEGATIVE_INFINITY;
        float max2 = Float.NEGATIVE_INFINITY;

        for (float num : mang) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }

        if (max2 == Float.NEGATIVE_INFINITY) {
            System.out.println("Khong co gia tri lon thu 2.");
        }

        return max2;
    }

    public static float[] XoaPhanTuLe(float[] mang) {
        int count = 0;
        for (float num : mang) {
            if (num % 2 == 0) {
                count++;
            }
        }

        float[] MangMoi = new float[count];
        int index = 0;
        for (float num : mang) {
            if (num % 2 == 0) {
                MangMoi[index++] = num;
            }
        }

        return MangMoi;
    }
}
