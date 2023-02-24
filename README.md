# Maven Assignment

**Creating maven project with sub-modules:-**

**Step 1: Generate new maven project**


	mvn archetype:generate


![projectcreated](https://user-images.githubusercontent.com/125345690/221233940-3e5a8097-d39f-489b-9567-502ff6e4306b.png)


**Step 2: Go to project [StringManipulation] directory and create modify-strings module**

  `mvn archetype:generate -DgroupId=com.knoldus.stringmanipulation  -DartifactId=modify-strings`

![sub-module_modify-strings](https://user-images.githubusercontent.com/125345690/221234048-fc02d3fe-cfc2-4c4f-a066-a09dd6fb5375.png)

**Step 3: Go to modify-strings module and create two module [modify-string as parent module]**

`mvn archetype:generate -DgroupId=com.knoldus.stringmanipulation  -DartifactId=string-api`

![string-implcreated](https://user-images.githubusercontent.com/125345690/221234146-897e65ce-144e-4c09-92a7-98e354b04972.png)

**Step 4: Method [1. reverseString() 2. getStringLength() ] created**

![Screenshot from 2023-02-24 21-36-37](https://user-images.githubusercontent.com/125345690/221234230-67010286-a934-4319-b32b-d2a6bf29cdb2.png)


**Step 5: Inside string-impl main class created and both methods called**

![Screenshot from 2023-02-24 21-40-40](https://user-images.githubusercontent.com/125345690/221234269-196cd36b-f613-4058-8db6-989ce3dec539.png)


**Step 6 : Mandatory dependencies/plugins added in parent pom.xml**

![Screenshot from 2023-02-24 21-43-49](https://user-images.githubusercontent.com/125345690/221234349-816f4561-b37b-409f-8e0a-68885a299bc7.png)

