const response = [
    "180.179.116.36 25/Apr/2017:16:30:10 +0530 'GET /apis/users/v1/account/MYNTRA/39fccd26.b285.465e.b54f.304aa2e43ee8zHtA8ki0mC/status HTTP/1.1' 200 0.053",
    "49.35.7.255 25/Apr/2017:16:30:10 +0530 'GET /apis/payments/v1/banks?upiOnly=false&since=1492518604455HTTP/2.0' 200 0.051 10.84.192.108:80 730 '-' 'okhttp/3.4.1' '-'",
    "136.185.40.177 25/Apr/2017:16:30:10 +0530 'POST /apis/users/v1/tokenrefresh/U1611141914140738574936HTTP/2.0' 200 0.012 10.84.192.98:80 960 '-' 'okhttp/3.4.1' '-'",
    "103.210.95.183 25/Apr/2017:16:30:10 +0530 'GET /apis/nexus/trai/details?lastSeen=1469908274993&pageSize=50HTTP/2.0' 500 0.004 10.84.192.175:80 5545 '-' 'okhttp/3.4.1' '-'"
];

const data = [];
response.forEach(v => {
    value = v.split("'");
    let res = {};

    res['ip'] = value[0].split("/")?.[0];
    res['month'] = value[0].split("/")?.[1];
    res['date_time']   = value[0].split("/")?.[2];
    res['http_method'] = value[1].split(" ")?.[0];
    res['endpoint'] = value[1].split(" ")?.[1];
    res['status_code'] = Number(value[2].split(" ")?.[1]);
    res['response_time'] = Number(value[2].split(" ")?.[2]);
    // console.log(res);
    data.push(res);

});


let queryGreaterThen10ms = data.filter(value => value['response_time'] > 0.01).map(value => value['endpoint']);
console.log("Q1. API Having time greater then 10ms\n");
console.log(queryGreaterThen10ms);
console.log("\nQ2. Grouping of total of status code\n");
let statusCodeGrouping = data.reduce((group , curr) => {
     if(group[curr['status_code']]){
        group[curr['status_code']] = group[curr['status_code']] + 1;
     }else{
        group[curr['status_code']] = 1;
     }
     return group;
},{});
console.log(statusCodeGrouping);

