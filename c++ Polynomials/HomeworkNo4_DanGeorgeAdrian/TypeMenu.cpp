//
// Created by Balu on 25.05.2024.
//

#include <cstdlib>
#include <iostream>
#include "../TypeEnum.h"

class TypeMenu {
public:
    static std::string typeMenu() {
        int option;
        do {
            printTypeMenu();
            std::cin>>option;
            switch(option)
            {
                case TypeEnum::NATURAL_NUMBERS:
                    return "unsigned int";
                    break;
                case TypeEnum::INTEGER_NUMBERS:
                    return "int";
                    break;
                case TypeEnum::REAL_NUMBERS:
                    return "double";
                    break;
                default :
                    std::cout<<"\n\nIncorrect option !";
            }
            std::cin.get();
        }while('a');
    }
private:
    static void printTypeMenu() {
        system("cls"); // cleaning window

        std::cout<<"\n\nSelect the set that includes the coefficients you will use:";
        std::cout<<"\n\n1. Natural Set ( e.g.: 1, 344, 122, 0, ...)";
        std::cout<<"\n\n2. Integers Set ( e.g.: -59, 4, -2, 0, ...)";
        std::cout<<"\n\n3. Real Set ( e.g.: 0.59, -24, 8, -0.37, ...)";
        std::cout<<"\n\nInput your option:";
    }
};