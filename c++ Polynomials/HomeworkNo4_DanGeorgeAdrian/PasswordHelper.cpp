//
// Created by Balu on 25.05.2024.
//

#include <stdio.h>
#include <conio.h>
#include <string.h>
#include <stdlib.h>

class PasswordHelper {
public:
    static void readPassword()
    {
        char password[20];
        char my_password[20]="BaluTheBear";
        int i;
        char ch;

        system("cls");
        printf("PASSWORD: ");

        i=0;

        do
        {
            ch=getch();
            password[i]=ch;
            if (ch!=27 && ch!=13)
                putch('*');
            else break;
            i++;
        }

        while (i<19);

        password[i]='\0';

        verifyPassword(password,my_password);

        printf("\n\nThe password is correct so the program is executed !\n");
    }

private:
    static void verifyPassword(char password[] ,char my_password[])
    {
        //if you want that password don't be case-sensitive
        // strupr(password);
        if (strcmp(password, my_password)!=0) // verify password
        {
            printf("\n\nIncorrect password !!!");
            _getch();
            return; // if the password is incorrect it will exit the program
        }
    }
};