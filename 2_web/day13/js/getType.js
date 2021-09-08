export default function getType(data){
    // return Object.prototype.toString.call(data)
    return Object.prototype.toString.call(data).slice(8, -1)
    // 앞에서부터 8개, 뒤에서부터 1개 삭제
}