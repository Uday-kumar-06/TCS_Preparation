# 🚀 TCS NQT Preparation Guide

A structured roadmap to crack **TCS NQT** by focusing on the most frequently asked coding topics.

---

## 📌 Categories Covered

- Arrays (High Priority)
- Strings
- Number Theory
- Series & Patterns
- Sorting & Algorithms
- Real-World Problems

---

## 🔥 1. Arrays (Almost Guaranteed!)

> Arrays are the most important topic in TCS NQT.

- Push all zeros to end of array ⭐ Easy  
- Find second largest element ⭐ Easy  
- Find missing number (1 to N) ⭐ Easy  
- Remove duplicates from array ⭐⭐ Medium  
- Rotate array by K elements ⭐⭐ Medium  
- Sort array of 0s, 1s, and 2s ⭐⭐ Medium  
- Count frequency of each element ⭐ Easy  
- Find element with odd occurrences ⭐⭐ Medium  
- Count subsets with given sum ⭐⭐⭐ Hard  

---

## 🔥 2. Strings (Very Frequently Asked)

- Check if string is palindrome ⭐ Easy  
- Check if two strings are anagrams ⭐ Easy  
- First non-repeating character ⭐⭐ Medium  
- Count vowels and consonants ⭐ Easy  
- Most occurring character ⭐ Easy  
- Reverse words in sentence ⭐⭐ Medium  
- Largest word in sentence ⭐ Easy  
- Remove spaces from string ⭐ Easy  

---

## 🔥 3. Number Theory (Always in Exam)

- Check prime number ⭐ Easy  
- Armstrong number ⭐ Easy  
- Reverse digits ⭐ Easy  
- Sum of digits repeated R times ⭐ Easy  
- Factorial (Recursion) ⭐ Easy  
- Fibonacci (Nth term) ⭐ Easy  
- Perfect number check ⭐⭐ Medium  
- GCD & LCM ⭐ Easy  
- Count digits ⭐ Easy  
- Toggle bits ⭐⭐ Medium  

---

## 🔥 4. Series & Patterns

- AP — Nth term ⭐ Easy  
- GP — Nth term ⭐ Easy  
- Sum of first N natural numbers ⭐ Easy  
- Pascal’s Triangle ⭐⭐ Medium  
- Mixed series pattern ⭐⭐ Medium  

---

## 🔥 5. Sorting & Algorithms

- Bubble Sort ⭐ Easy  
- Binary Search ⭐ Easy  
- Count elements greater than previous ⭐⭐ Medium  
- Kth smallest/largest element ⭐⭐ Medium  

---

## 🔥 6. Real-World / Story Problems

> TCS often asks logical questions in story format.

- Chocolate factory packets → Array manipulation  
- Library book sorting → Sorting  
- Gem stones count → Strings / Sets  
- Circular arrangement → Math / Permutations  

---

## 🗓️ Preparation Plan

---

## 🎯 Tips

- Focus on **logic building**
- Practice **daily**
- Revise **easy questions thoroughly**
- Solve **mock tests regularly**

---

## 💡 Goal

Crack TCS NQT by mastering **important patterns**, not everything.

---

## 📂 Future Improvements

- [ ] Add Java solutions  
- [ ] Add test cases  
- [ ] Add optimized approaches  
- [ ] Add mock test links  

---

# 🚀 TCS NQT Input/Output Mastery Guide (Java)

Master every input/output format asked in **TCS NQT** with ready-to-use Java templates 💪  
This guide covers **all common patterns** with examples and explanations.

---

## 📌 1. Single Integer

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
    }
}
```

**Input**
```
5
```

---

## 📌 2. Two Integers on Same Line

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

**Input**
```
5 10
```

---

## 📌 3. Two Integers on Different Lines

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); // works for both cases
        System.out.println(a + b);
    }
}
```

**Input**
```
5
10
```

✅ `nextInt()` automatically handles whitespace and newlines.

---

## 📌 4. Array (Size Given First)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
```

**Input**
```
5
1 2 3 4 5
```

---

## 📌 5. Array (No Size Given)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();

        String[] parts = line.split(" ");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
```

**Input**
```
1 2 3 4 5
```

---

## 📌 6. Bracket Format Array `[1,2,3,4,5]`

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();

        line = line.replace("[", "").replace("]", "");
        String[] parts = line.split(",");

        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
```

**Input**
```
[1,2,3,4,5]
```

---

## 📌 7. int then String (⚠️ Common Trap)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // IMPORTANT

        String s = sc.nextLine();

        System.out.println(n);
        System.out.println(s);
    }
}
```

**Input**
```
5
hello world
```

❌ Without `sc.nextLine()` → string becomes empty!

---

## 📌 8. Multiple Strings

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine().trim();
            System.out.println(s);
        }
    }
}
```

**Input**
```
3
hello
world
java
```

---

## 📌 9. Multiple Test Cases with Arrays

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(arr[0]); // example
        }
    }
}
```

---

## 📌 10. Matrix / 2D Array

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## 📌 11. Comma-Separated Values

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine().trim();
        String[] parts = line.split(",");

        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
```

---

## 📌 12. Mixed Input (Hardest)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();

        int m = Integer.parseInt(sc.nextLine().trim());

        int[] arr = new int[m];
        String[] parts = sc.nextLine().trim().split(" ");

        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(n + " " + name + " " + m);
    }
}
```

---

# 🧠 Golden Rules

```
Rule 1 → nextInt() skips whitespace & newlines
Rule 2 → Always use sc.nextLine() after nextInt()
Rule 3 → Always use trim()
Rule 4 → Unknown size → nextLine() + split()
Rule 5 → Bracket format → replace + split
Rule 6 → Output must be EXACT
```

---

# ⚡ Universal Template (Safe for Any Input)

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine().trim();

        if (line.contains("[")) {
            line = line.replace("[","").replace("]","");
            String[] parts = line.split(",");
        } else if (line.contains(",")) {
            String[] parts = line.split(",");
        } else {
            String[] parts = line.split(" ");
        }
    }
}
```

---

## ⭐ Pro Tip

If you're confused in exam:  
👉 Use `nextLine()` + `split()` → safest approach

---

⭐ If this helps you, consider giving a star!
