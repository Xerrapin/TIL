// 클래스
// 1) 리터럴 방식
// 2) 함수 방식
// 3) 프로토타입 방식

const jaehyeok = {
    firstName: 'Jaehyeok',
    lastName: 'Lim',
    getFullName: function() {
        return `${this.firstName} ${this.lastName}입니다.`
    }
}

// console.log(jaehyeok)
console.log(jaehyeok.getFullName())

const amy = {
    firstName: 'amy',
    lastName: 'choi',
    getFullName: function() {
        return `${this.firstName} ${this.lastName}입니다.`
    }
}

console.log(amy.getFullName())
console.log('---------------------------------------')

function user(first, last) { 
    this.firstName = first
    this.lastName = last
    this.getFullName = function() {
        return `${this.firstName} ${this.lastName}입니다.`
    }
}

function user(first, last) { 
    this.firstName = first
    this.lastName = last
    // this.getFullName = () => {
    //     return `${this.firstName} ${this.lastName}입니다.`
    // }
    this.getFullName = () => `${this.firstName} ${this.lastName}입니다.`
}


const yuna = new user('yuna', 'Kim') // 생성자 함수로 만들기
console.log(yuna)

function person(first, last) {
    this.firstName = first
    this.lastName = last
}


// person.prototype.getFullName = function() {
//     return `${this.firstName} ${this.lastName}`
// }
person.prototype.getFullName = () => `${this.firstName} ${this.lastName}`

const person1 = new person('yuna2', 'kim2')
const person2 = new person('yuna3', 'kim3')
const person3 = new person('yuna4', 'kim4')

console.log(person1)
console.log(person1.getFullName())
console.log(person2.getFullName())
console.log(person3.getFullName())

// this
// 일반(Normal)함수는 호출 위치에 따라 this 정의
// 화살표(Arrow)함수는 자신이 선언된 함수 범위에서 this 정의
function EmpName(name) {
    this.name = name
}
EmpName.prototype.normal = function() {
    console.log(this.name)
}

EmpName.prototype.arrow = () =>{
    console.log(this.name)
}

const smile = new EmpName('young hee')
smile.normal()
smile.arrow()  // 출력 안됨 확인

const timer = {
    name: 'KangNam',
    timeout: function() {
        setTimeout(() => {
            console.log(this.name)
        }, 2000);
    }
}

timer.timeout(
    clearInterval(timer)
)

const kanghee = {
    name: 'hahaha',
    normal() {
        console.log(this.name)
    },
    arrow: () => {
        console.log(this.name)
    }
}

kanghee.normal()
kanghee.arrow()  // 화살표함수 실행 안됨 확인.

class Vehicle {
    constructor(name, whell) {
        this.name = name
        this.whell = whell
    }
}

const myVehicle = new Vehicle('운송수단', 2)
console.log(myVehicle)

class Bicycle extends Vehicle {
    constructor(name, wheel){
        super(name, wheel)
    }
}

class Car extends Vehicle {
    constructor(name, wheel, license){
        super(name, wheel)
        this.license = license
    }
}
/*
문제] Emp 클래스 - 사번, 사원명, output 메소드
*/

function Emp(empNo, empName) { 
    this.empNo = empNo;
    this.empName = empName;
    this.output = ()  => `사원번호 : ${this.empNo} 사원명 : ${this.lastName}입니다.`
}

const No1 = new Emp(1, 'Kim')
const No2 = new Emp(2, 'Lim')
const No3 = new Emp(3, 'Lee')
const No4 = new Emp(4, 'Park')
const No5 = new Emp(5, 'hong')

console.log(No1); console.log(No2); console.log(No3); console.log(No4); console.log(No5);

/*
// 1) 리터럴 방식
const 인스턴스 = {
    프로퍼티1 : 초기값,
    프로퍼티2 : 초기값,
    메소드1 : function() {

    },
    매소드2 : function() {

    }
}

// 2) 함수 방식
function 클래스이름() {
    this.프로퍼티1 = 초기값;
    this.프로퍼티2 = 초기값;

    this.메소드1 = function() {

    }
    this.메소드2 = function() {

    }
}

const 인스턴스 = new 클래스이름();


// 3) 프로토타입 방식
function 클래스이름() {
    this.프로퍼티1 = 초기값;
    this.프로퍼티2 = 초기값;

    클래스이름.prototype.메소드1 = function() {

    }
}
*/



