
/*get rollId after 2 sec
                get userDetails after 2 sec
                              get courseDetails after 3 sec
--chaining of promise first fetch all roll id , then fetch one of user details ,
  then fetch course details of user so these call actually dependent
  on each other so here chaining used for synchronous callback

Advantage - more readability and maintainability

finally - always run when promise settled i.e resolve or rejected
promises state
        - pending (some task done in future)
        - resolve
        - reject
        - settled
*/

const rollPromise = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            let rollId = [1, 2, 3];
            resolve(rollId);
        }, 2000);
    });
}
const userPromise = (rollId) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            let rollIdDetails = {
                1: { 'name': 'Abhishek', 'age': 31, "course_id": 2 },
                2: { 'name': 'Sahil', 'age': 30, "course_id": 34 },
                3: { 'name': 'king', 'age': 32, "course_id": 35 }
            };
            if (typeof rollIdDetails[rollId] == "undefined")
                reject(`Roll id ${rollId} not registered`);
            else
                resolve(rollIdDetails[rollId]);
        }, 5000);
    });
}

const coursePromise = (courseId) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            let courseDetails = {
                2: { 'course': 'CSE' },
                34: { 'course': '10' },
                35: { 'course': 'ECE' }
            };
            if (typeof courseDetails[courseId] == "undefined")
                reject(`Course having ${courseId} not registered`);
            else
                resolve(courseDetails[courseId]);
        }, 1000);
    });
};
let rollIdDetails = 1;
const promise = new Promise((resolve, reject) => {
    return rollPromise().then((rollIds) => {
        console.log(rollIds);
        return userPromise(rollIdDetails).then((userDetails) => {
            console.log(userDetails);
            return coursePromise(userDetails['course_id']).then((courseDetails) => {
                console.log(courseDetails);
            }).catch((e) => {
                console.log(e);
            }).finally(() => {
                console.log("promise settled course details success");
            });
        }).catch((e) => {
            console.log(e);
        }).finally(() => {
            console.log("promise settled User details success");
        });
    }).catch((e) => {
        console.log(e);
    }).finally(() => {
        console.log("promise settled RollId details success");
    });
});