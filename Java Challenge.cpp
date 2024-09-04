 //1. Write a Java program to print a hollow pyramid pattern using asterisks (*) and spaces.

/*#include <iostream>
using namespace std;

void HPyramid(int height)
{
    for (int i=0;i<height;i++)
        {
        for (int j=height-i-1;j>0;j--)
            {
            cout<<" ";
        }
        for (int j= 0;j<(2*i+1);j++)
        {
            if (j==0 || j==(2*i) || i==height-1) {
                cout<<"*";
            } else {
                cout<<" ";
            }
        }
        cout<<endl;
    }
}

int main()
 {
    int height;

    cout<<"Enter the height of the pyramid:";
    cin>>height;

    if (height<=0){
        cout<<"Height must be a positive integer."<<endl;
        return 1;
    }
    HPyramid(height);

    return 0;
}
*/


//2. Write a Java program to print a hollow inverted pyramid pattern using asterisks (*) and spaces.

/*#include <iostream>
using namespace std;

void InvertedPyramid(int height)
{
    for (int i=0;i<height;i++)
        {
        for (int j=0;j<i;j++)
            {
            cout<<" ";
        }
        for (int j=0;j<(2*(height - i)-1);j++)
            {
            if (j==0 || j==(2*(height-i)-2) || i==0)
            {
                cout<<"*";
            }
             else
            {
                cout<<" ";
            }
        }
        cout<<endl;
    }
}

int main() {
    int height;

    cout << "Enter the height of the inverted pyramid: ";
    cin >> height;

    if (height <= 0)
        {
        cout << "Height must be a positive integer." << endl;
        return 1;
    }
    InvertedPyramid(height);

    return 0;
}
*/

//3. Write a Java program to print a pyramid pattern of alphabets, starting from 'A', using spaces.

/*
#include <iostream>
using namespace std;

void Alphabet(int height)
{
    for (int i=0;i<height;i++)
        {
        for (int j=height-i-1;j>0;j--)
            {
            cout<<" ";
        }
        for (int j=0;j<=i;j++)
        {
            cout<<char('A' + j)<<" ";
        }
        cout<<endl;
    }
}

int main()
{
    int height;
    cout<<"Enter the height of the pyramid: ";
    cin>>height;

    if (height<=0)
        {
        cout<<"Height must be a positive integer."<<endl;
        return 1;
    }
    Alphabet(height);

    return 0;
}
*/

//4. Write a Java program to print a hollow right triangle pattern using numbers and spaces.

/*
#include <iostream>
using namespace std;

void RightTriangle(int height)
{
    for (int i=1;i<=height;i++)
        {
        for (int j=1;j<=i;j++)
            {
            cout<<j<<" ";
        }
        for (int j=i+1;j<=height;j++)
            {
            cout<< "  ";
        }
        cout<<endl;
    }
}
int main()
{
    int height;
    cout<<"Enter the height of the right triangle:";
    cin>>height;

    if (height <= 0)
        {
        cout<<"Height must be a positive integer"<<endl;
        return 1;
    }
    RightTriangle(height);
    return 0;
}
*/
