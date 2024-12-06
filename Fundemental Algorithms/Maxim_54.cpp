#include <iostream>
using namespace std;

int main() {
	int x, max;
	cin >> x;
	max = x;
	if (x == 0)
	{
		cout << "NU EXISTA";

	}
	else
	{


		while (x != 0)
		{
			cin >> x;
			if (x > max && x != 0)
			{
				max = x;
			}
		}

		cout << max;

	}

}