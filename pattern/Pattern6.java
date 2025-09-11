//           *           if input is 7
 //        *   * 
 //       *     * 
 //      *       * 
 //       *     * 
 //        *   * 
 //          * 

 //        *             if input is 5
 //      *   * 
 //     *     * 
 //      *   * 
 //        * 
 
class Pattern6
 {

    public static void main(String[] args) {

        

       

        int InputOddNum = 7;

        int VarMid = InputOddNum / 2 ;

        char[][] myArray = new char[InputOddNum][InputOddNum];

        char DisplayValue = '*';

        System.out.print("InputOddNum=" + InputOddNum);

        //System.out.print("VarMid=" + C);

        int temp=0;

        int increment=1;
        
        for (int i = 0; i < InputOddNum; i++) 
        {
            for (int j = 0; j < InputOddNum; j++) 
            {

                myArray[i][j] = ' '; //initializing the array

            }

        }

        for (int i = 0; i < InputOddNum; i++) {

                if (i == 0 || i == (InputOddNum-1))  //first&last row
                {

                    myArray[i][(VarMid)] = DisplayValue;

                }

                else if (i <= VarMid) //upperhalf
                {

                    myArray[i][(VarMid-i)] = DisplayValue;

                    myArray[i][(VarMid+i)] = DisplayValue;

                }

                else   //lowerhalf
                {

                    myArray[i][(i-VarMid)] = DisplayValue;

                    temp = (i+VarMid)-(i-VarMid+increment); //formula 

                    myArray[i][temp] = DisplayValue;

                    increment = increment + 1;

                }

        }

        for (int i = 0; i < InputOddNum; i++) {

            System.out.print("\n");

            for (int j = 0; j < InputOddNum; j++) {

                System.out.print(myArray[i][j] + " "); //display

             }

        }

    }

}
