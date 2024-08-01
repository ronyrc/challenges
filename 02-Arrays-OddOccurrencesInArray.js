function solution(N) {
    let a = {}
    for (let i = 0; i < N.length; i++) {
        a[`${N[i]}`] = (a[`${N[i]}`]) ? a[`${N[i]}`] + 1 : 1;
    }
    return Object.keys(a).map((key) => [Number(key), a[key]]).find(i => i[1] % 2)[0];    
}

console.log(solution([9, 3, 9, 3, 9, 7, 9]));