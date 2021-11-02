
#include <cstdio>
#include <cstring>
#include <cctype>

int main()
{
    int n;
    char spreadsheet[20];
    scanf("%d", &n);
    while (n--)
    {
        scanf("%s", spreadsheet);
        size_t m = strlen(spreadsheet);
        size_t C = 1;
        while (C < m && isdigit(spreadsheet[C]))
        {
            ++C;
        }

        if (C > 1 && C < m)
        {
            int col(0);
            for (size_t i = C + 1; i < m; ++i)
            {
                col = col * 10 + (spreadsheet[i] - '0');
            }

            int pow(26);
            while (col > pow)
            {
                col -= pow;
                pow *= 26;
            }

            col -= 1;
            while (pow != 1)
            {
                pow /= 26;
                printf("%c", col / pow + 'A');
                col %= pow;
            }

            spreadsheet[C] = 0;
            printf("%s\n", spreadsheet + 1);
        }
        else
        {
            int col(0), val(0), pow = (1);
            size_t i = 0;
            while (isalpha(spreadsheet[i]))
            {
                col += pow;
                pow *= 26;
                val = val * 26 + spreadsheet[i] - 'A';
                i += 1;
            }
            col += val;
            printf("R%sC%d\n", spreadsheet + i, col);
        }
    }
    return 0;
}

