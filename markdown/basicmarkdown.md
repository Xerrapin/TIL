# How to use Markdown

# markdown

```
마크다운은 웹에서 글을 쓰는 사람들을 위해 텍스트를 HTML로 변환해주는 툴이다.

```

## Header

-   제목

```
# h1

## h2

### h3 ###

#### h4 ####

##### h5

###### h6

####### h7?

닫는 hash를 가독성을 위해 사용할 수 있다.
```

# h1

## h2

### h3

#### h4

##### h5

###### h6

####### h7?

1~6까지

## 강조

```
*single asterisks*
_single underscores_
**double asterisks**
__double underscores__
~~cancelline~~
```

-   _single asterisks_
-   _single underscores_
-   **double asterisks**
-   **double underscores**
-   ~~cancelline~~

## BlockQuote

> blockquote
>
> > blockquote2
> >
> > > blockquote3 <br> 이어서 작성

1. 첫번째 목록
2. 두번째 목록
3. 세번째 목록

57\. 번째 목록

```
57\. 번째목록   -> \를 사용함으로써 순서에서 벗어날 수 있다.
```

-   깊이1
    -   깊이2
        -   깊이3
            -   깊이4
                -   깊이5

> -, \*, + 모두 동일하게 작동한다.

# 표

```
| 출판일자        | 책 제목   | 출판사     |
| --------------- | --------- | ---------- |
| 2022년 3월 21일 | 홍길동전  | 땡땡출판사 |
| 2022년 3월 21일 | 홍길동전2 | 땡땡출판사 |
| 2022년 3월 21일 | 홍길동전3 | 땡땡출판사 |
| 2022년 3월 21일 | 홍길동전4 | 땡땡출판사 |
```

| 출판일자        | 책 제목   | 출판사     |
| --------------- | --------- | ---------- |
| 2022년 3월 21일 | 홍길동전  | 땡땡출판사 |
| 2022년 3월 21일 | 홍길동전2 | 땡땡출판사 |
| 2022년 3월 21일 | 홍길동전3 | 땡땡출판사 |
| 2022년 3월 21일 | 홍길동전4 | 땡땡출판사 |

# Collapsed sections

````
<details><summary>CLICK ME</summary>
<p>

#### We can hide anything, even code!

    ```ruby
      puts "Hello World"
    ```

</p>
</details>

````

<details><summary>CLICK ME</summary>
<p>

#### We can hide anything, even code!

짜잔

```
hello world!
```

</p>
</details>

# code

`hello` 코드

# codeblock

```
코드블록. 강조하고싶은 내용, 버전정보, 코드 등을 넣는다.
```

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

```javascript
alert("Hello, world!");
```

# horizon line

수평선

# 들여쓰기

하나

    둘

셋

# 링크

```
[네이버 링크](www.naver.com)
```

[네이버 링크](www.naver.com)

<hr>
github markdown test

### UML markdown

### Creating Mermaid diagrams

```mermaid
graph TD;
    A-->B;
    A-->C;
    B-->D;
    C-->D;
```

### Creating geoJSON and topoJSON maps

```geojson
{
    "type": "Polygon",
    "coordinates": [
        [
            [-90, 30],
            [-90, 35],
            [-90, 35],
            [-85, 35],
            [-85, 30]
        ]
    ]
}
```

### Using topoJSON

```topojson
{
    "type": "Topology",
    "transform": {
        "scale": [0.0005000500050005, 0.00010001000100010001],
        "translate": [100, 0]
    },
    "objects": {
        "example": {
            "type": "GeometryCollection",
            "geometries": [
                {
                    "type": "Point",
                    "properties": { "prop0": "value0" },
                    "coordinates": [4000, 5000]
                },
                {
                    "type": "LineString",
                    "properties": { "prop0": "value0", "prop1": 0 },
                    "arcs": [0]
                },
                {
                    "type": "Polygon",
                    "properties": {
                        "prop0": "value0",
                        "prop1": { "this": "that" }
                    },
                    "arcs": [[1]]
                }
            ]
        }
    },
    "arcs": [
        [
            [4000, 0],
            [1999, 9999],
            [2000, -9999],
            [2000, 9999]
        ],
        [
            [0, 0],
            [0, 9999],
            [2000, 0],
            [0, -9999],
            [-2000, 0]
        ]
    ]
}
```

### Creating STL 3D models

```stl
solid cube_corner
  facet normal 0.0 -1.0 0.0
    outer loop
      vertex 0.0 0.0 0.0
      vertex 1.0 0.0 0.0
      vertex 0.0 0.0 1.0
    endloop
  endfacet
  facet normal 0.0 0.0 -1.0
    outer loop
      vertex 0.0 0.0 0.0
      vertex 0.0 1.0 0.0
      vertex 1.0 0.0 0.0
    endloop
  endfacet
  facet normal -1.0 0.0 0.0
    outer loop
      vertex 0.0 0.0 0.0
      vertex 0.0 0.0 1.0
      vertex 0.0 1.0 0.0
    endloop
  endfacet
  facet normal 0.577 0.577 0.577
    outer loop
      vertex 1.0 0.0 0.0
      vertex 0.0 1.0 0.0
      vertex 0.0 0.0 1.0
    endloop
  endfacet
endsolid
```

&copy;

##### 참고문서

-   [[공통] 마크다운 markdown 작성법
    ](https://gist.github.com/ihoneymon/652be052a0727ad59601)
-   [github 공식문서](https://docs.github.com/en)
