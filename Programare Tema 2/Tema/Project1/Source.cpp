#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

class LargeNumber {
private:
    string number = "";

public:
    LargeNumber(const string& num)  {
        this->number.append(num);
    }

    friend ostream& operator<<(ostream& os,const  LargeNumber& num) {
        os << num.number;
        return os;
    }

    LargeNumber operator+( LargeNumber& other)  {
        int maxLen = max(number.length(), other.number.length());
        string paddedSelf = string(maxLen - number.length(), '0') + number;
        string paddedOther = string(maxLen - other.number.length(), '0') + other.number;

        int carry = 0;
        string result;
        for (int i = maxLen - 1; i >= 0; --i) {
            int digitSum = (paddedSelf[i] - '0') + (paddedOther[i] - '0') + carry;
            result = to_string(digitSum % 10) + result;
            carry = digitSum / 10;
        }

        if (carry > 0)
            result = to_string(carry) + result;

        return LargeNumber(result);
    }

    LargeNumber operator-( LargeNumber& other)  {
        int maxLen = max(number.length(), other.number.length());
        string paddedSelf = string(maxLen - number.length(), '0') + number;
        string paddedOther = string(maxLen - other.number.length(), '0') + other.number;

        int borrow = 0;
        string result;
        for (int i = maxLen - 1; i >= 0; --i) {
            int digitDiff = (paddedSelf[i] - '0') - (paddedOther[i] - '0') - borrow;
            if (digitDiff < 0) {
                digitDiff += 10;
                borrow = 1;
            }
            else {
                borrow = 0;
            }
            result = to_string(digitDiff) + result;
        }

        // Remove leading zeros
        result.erase(0, min(result.find_first_not_of('0'), result.size() - 1));

        return LargeNumber(result);
    }

    LargeNumber operator*( LargeNumber& other)  {
        LargeNumber result("0");

        for (int i = other.number.length() - 1; i >= 0; --i) {
            int digit = other.number[i] - '0';
            LargeNumber tempResult = multiplyByDigit(digit);
            tempResult.shiftLeft(other.number.length() - i - 1);
            result = result + tempResult;
        }

        return result;
    }

    LargeNumber multiplyByDigit(int digit)  {
        int carry = 0;
        string result;
        for (int i = number.length() - 1; i >= 0; --i) {
            int product = (number[i] - '0') * digit + carry;
            result = to_string(product % 10) + result;
            carry = product / 10;
        }

        if (carry > 0)
            result = to_string(carry) + result;

        return LargeNumber(result);
    }

    void shiftLeft(int count) {
        number += string(count, '0');
    }

    bool operator<( LargeNumber& other)  {
        return number < other.number;
    }

    bool operator>( LargeNumber& other)  {
        return number > other.number;
    }

    bool operator==( LargeNumber& other)  {
        return number == other.number;
    }
};

int main() {
    LargeNumber num1("1234567890");
    LargeNumber num2("9876543210");

    cout << "Do you want to type a new number ?(y/n)";
    char response;
    cin >> response;
    if (response == 'y')
    {
        string value1, value2;
        cout << "Please type the first number:";
        cin >> value1;
        cout << "Please type the second number:";
        cin >> value2;
        num1 = LargeNumber(value1);
        num2 = LargeNumber(value2);
    }
    else {
        
        throw invalid_argument("wrong answer!");
            
    }
    

    cout << "num1 = " << num1 << endl;
    cout << "num2 = " << num2 << endl;

    LargeNumber sumResult = num1 + num2;
    cout << "Sum: " << sumResult << endl;

    LargeNumber diffResult = num1 - num2;
    cout << "Difference: " << diffResult << endl;

    LargeNumber mulResult = num1 * num2;
    cout << "Multiplication: " << mulResult << endl;

    cout << "num1 < num2: " << (num1 < num2) << endl;
    cout << "num1 > num2: " << (num1 > num2) << endl;
    cout << "num1 == num2: " << (num1 == num2) << endl;

    return 0;
}
