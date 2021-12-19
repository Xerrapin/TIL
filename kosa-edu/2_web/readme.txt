1. 표기법
dash-case(kebab-case)
snake_case
camelCase
ParcelCase

2. 변수 선언 할때
   let , const
   var <--- X

3. 주석
// 한줄 주석
/* 여러줄 주석 */
/**
* 여러줄
*  메모1,...
*/

4. 데이터 종류(자료형)
        String
        Number
        Boolean
        undefined
        null
        Object
        Array

5. 예약어
6. 함수(function)
function helloFunc() {
    // 실행코드
    console.log('hello javascript!!');
}
//함수 호출
helloFunc(); 

function returnFunc(){
    return 300;
}
let su = returnFunc();
console.log(su);
console.log(returnFunc());

7. 제어문
if~else
switch~case
for
while
do~while

8. 스크립트 외부 파일로 연결
<script src="../js/script.js"></script>

9. 스크립트 파일 안에 다른 스크립트 연결하기
// import { getType, subView  } from "./test.js"
import getType from './test.js'
 
 > index.html  <---  type="module"
 <script type="module" defer src="../js/sub.js"></script>

10. 연산자
  ==  vs ===   

11. scope
변수 유효범위(Variable Scope)
var, let, const

12. method(function)
(fuction () { // statements })()

(function square(x) { console.log(x*x); })(2)

13. calss
1) 리터럴 방식
2) 함수 방식
3) 프로토타입 방식