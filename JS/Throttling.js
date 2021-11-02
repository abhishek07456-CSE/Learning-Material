function clickMe(value){
    console.log("-----------------------------------hi " + value);
}
throttled = (func , delay)=>{
    let past = 0;
    return function () {
        let now = new Date().getTime();
        console.log(`waiting delay !!!`);
        if((now-past)>delay){
            console.log(`past time ${past}`);
            past = now;
            return func;
        }
    }
}

bestWay = (value) => {
    document.getElementById('best').addEventListener("click" , throttled(clickMe(value) , 500));
}
