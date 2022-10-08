$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Feature/Home_Page.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "HomePage",
  "description": "",
  "id": "hotel-booking-in-adactin-application;homepage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    },
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter Username",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user Enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Click On Login Button And It Navigates To The Search HotelPage",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_Launch_The_Application()"
});
formatter.result({
  "duration": 6603411500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enter_Username()"
});
formatter.result({
  "duration": 453026000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Enter_Password()"
});
formatter.result({
  "duration": 245226100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Click_On_Login_Button_And_It_Navigates_To_The_Search_HotelPage()"
});
formatter.result({
  "duration": 1786493500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User Search And Select The Room And Details In The Select Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-search-and-select-the-room-and-details-in-the-select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User Select The Location",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User Select The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Select The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User Select The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Select The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Select The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User Select The Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Select The Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Click The Search Button It Navigates To The \"Adactin.com - Select Hotel\" Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_Select_The_Location()"
});
formatter.result({
  "duration": 434562600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_The_Hotel()"
});
formatter.result({
  "duration": 297347100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 196680700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 194891300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_The_Check_In_Date()"
});
formatter.result({
  "duration": 339270200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_The_Check_Out_Date()"
});
formatter.result({
  "duration": 433719500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_The_Adults_Per_Room()"
});
formatter.result({
  "duration": 317912400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Def.user_Select_The_Children_Per_Room()"
});
formatter.result({
  "duration": 272454500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adactin.com - Select Hotel",
      "offset": 50
    }
  ],
  "location": "Step_Def.user_Click_The_Search_Button_It_Navigates_To_The_Page(String)"
});
formatter.result({
  "duration": 1864500000,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "User Confirm The Room In Search Hotel page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-confirm-the-room-in-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "User Click The Select Button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User Click The Continue Button It Navigates To The \"Adactin.com - Book A Hotel\" Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Def.user_Click_The_Select_Button()"
});
formatter.result({
  "duration": 728797100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adactin.com - Book A Hotel",
      "offset": 52
    }
  ],
  "location": "Step_Def.user_Click_The_Continue_Button_It_Navigates_To_The_Page(String)"
});
formatter.result({
  "duration": 1010272300,
  "status": "passed"
});
});