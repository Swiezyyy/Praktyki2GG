package Praktyki.petle;

public class czwarte
{

// nested for
// wiersze
        for(int i = 1; i < 10;i++)

    {
        // kolumny
        for (int j = 1; j < 10; j++) {
            if ((j * i) % 6 == 0) {
                System.out.print(j * i + "\t");
            } else {
                System.out.print("X\t");
            }

        }
        System.out.println();
    }
}