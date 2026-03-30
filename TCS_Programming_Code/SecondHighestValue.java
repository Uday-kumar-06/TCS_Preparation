int first = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;

for (int num : arr2) {
    if (num > first) {
        second = first;
        first = num;
    } else if (num > second && num != first) {
        second = num;
    }
}

if (second == Integer.MIN_VALUE) {
    System.out.println(-1);
} else {
    System.out.println(second);
}
