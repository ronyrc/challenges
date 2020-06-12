function solution(N) {
    const s = parseInt(N, 10).toString(2);
    let startCount = false, finishCount = false, gap = 0, j = 0;

    for (let i = 0; i < s.length; i++) {
        if (s[i] == '1' && !startCount) {
            startCount = true;
        } else if (s[i] == '1' && startCount) {
            startCount = (i < s.length && s[i+1] == '0');
            j = 0;            
        } else if (s[i] == '0' && startCount) {
            if (j++ >= gap && i < s.length && s[i+1] == '1') gap = j;
            if (!finishCount) finishCount = (i < s.length && s[i+1] == '1');
        }
    }

    return (finishCount ? gap : 0);
}

console.log(solution(9)); // 2 // 1001
console.log(solution(529)); // 4 // 1000010001
console.log(solution(20)); // 1 // 10100
console.log(solution(15)); // 0 // 1111
console.log(solution(32)); // 0 // 100000
console.log(solution(1041)); // 5 // 10000010001

