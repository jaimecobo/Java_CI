console.log("Script is loaded!");

let teachers = ['Shane', 'Zack'];

console.log(teachers);
console.log(teachers[0]); //'Shane'
console.log(teachers.length);  //2)

teachers = ['Assaf', 'Shane'];
teachers.push('Zack'); //['Assaf', 'Shane', 'Zack']
console.log(teachers);
let teacher1 = teachers.pop(); //teacher1 == 'Zack', teachers == ['Assaf', 'Shane']
console.log(teacher1);
console.log(teachers);


teachers.unshift('Zack'); // ['Zack', Assaf', 'Shane']
console.log(teachers);
let teacher = teachers.shift(); //teacher == 'Zack', teachers = ['Assaf', Shane']
console.log(teacher);

teachers[4] = 'James Taylor'; // ['Assaf', 'Shane', 'Zack', undefined, 'James Taylor'];
console.log(teachers);
console.log(teachers[4]);
console.log("There is nothing in index3 so index 3 will show: " + teachers[3]);
teachers[4] = 'Billy Joel'; // ['Assaf', 'Shane', 'Zack', undefined, 'Billy Joel'];
console.log(teachers);

console.log("Index of Shane is: " + teachers.indexOf("Shane"));


let a = [10,11,20];
a.indexOf(11); //1
a.indexOf(50); //-1

a = [1,2,3,4];
//Slice - doesn't mutate array, slice(start,end)
a.slice(0,2); //[1,2]
console.log(a); // [1, 2, 3, 4]
console.log(a.slice(0,2)); // [1, 2]
console.log('abcd'.slice(1,3)); // 'bc'


//Splice - splice(start,numToRemove,...items to add) - this does mutate
a.splice(1,2,'a','b'); //a is [1,'a','b',4]
console.log(a);

//Iterating over Arrays using for loop and forEach
teachers = ['Assaf', 'Shane', 'Zack']
for(let i = 0; i < teachers.length; i++) {
	console.log(teachers[i]);
}

//Uses a function
teachers.forEach(function(item, index) {
	console.log(item + " is at index " + index);
});


//Converting Arrays to Strings "Stringifying"
teachers = ['Assaf', 'Shane'];
console.log(teachers.toString()); //'Assaf,Shane'
console.log(teachers.join('&')); // 'Assaf&Shane'

//Ordering an Array
a = [2, 1, 3]
console.log(a);
a.sort(); //[1,2,3]
console.log(a);
console.log(a.sort());

a.reverse(); //[3,2,1]
console.log(a);

//#########################################################
//############## CREATING AN OBJECT IN JS #################
//#########################################################
let course = {
	name: 'JavaScript Applications',
	awesome: true,
    teachersList: teachers,
}
console.log("This course is awesome = " + course.awesome);
console.log(course.name);
console.log(course.teachersList);

let school = {
    name: "The place we go",
    courses: course,
}

console.log(school.courses);


course = {
	name: 'JavaScript Applications',
	awesome: true,
	teachers: ['Assaf', 'Shane'],
	students: [
		{
			name: 'Steve',
			computer: {
				OS: 'Linux',
				type: 'laptop'
			}
		}
	]
};

console.log(course.students[0].computer.OS);

//Updating: Properties of objects can be updated after an object is created.
course.name = "super duper class";
console.log(course);
//Mutating: You can also assign entirely new keys, delete existing ones.
course.fun = true; //add a property
delete course.name; //remove one
console.log(course);


let myArray = [];
myArray.push("newString");
myArray.push(123);
console.log(myArray);