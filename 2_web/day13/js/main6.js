const result = 'Hello World'.indexOf('World')
console.log(result)

const str = 'dlawogur14@naver.com'
console.log(str.match(/.+(?=@)/)[0])
// ? 는 앞의 내용을 찾겠다는 의미.
// . : 하나이상, + 여러개.

// trim은 공백 제거. length는 길이 
const msg = '    Hello world     '
console.log(msg.length)
msg2 = msg.trim();
console.log(msg2.length)

// toFixed : 소수점 이하 n자리수까지 출력
const pi = 3.14159265358979
console.log(pi)

const s1 = pi.toFixed(4);
console.log(s1)
console.log(typeof s1) // string

const integer = parseInt(s1)
const float = parseFloat(s1)

console.log(integer)
console.log(float)
console.log(typeof integer, typeof float) // number

// 배열
const cars = ["Saab", "Volvo", "BMW"];
const numbers = [1, 2, 3];
console.log(numbers)
console.log(cars)
console.log(numbers[2])
console.log(cars[1])

console.log([].length)
console.log(numbers.concat(cars))

const ages = [3, 10, 18, 20];

function checkAge(age) {
  return age > 18;
}

function myFunction() {
  document.getElementById("demo").innerHTML = ages.find(checkAge);
}


// map()
cars.forEach(function(element, index, array) {
    console.log(`${car}-$[i}`)
})
console.log(a)





















