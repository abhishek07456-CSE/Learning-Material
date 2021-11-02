function searchApi(e){
    if(e!=undefined)
    console.log(e.target.value);

}
searchOptimisticApi = (func , delay) => {
    let timer;
    return function(){
        let context = this;
        let args = arguments;
        // console.log("waiting !!!!!")
        clearTimeout(timer); // if any frequent key entered then last timer which need to execute it pop out from the stack so no frequent searchAPi fun run
        timer = setTimeout(() => {
            func.apply(context,args);
        },delay)
    }
}
document.getElementById('expensive_input').addEventListener('keyup' , searchApi);
document.getElementById('better_input').addEventListener('keyup' , searchOptimisticApi(searchApi,500));