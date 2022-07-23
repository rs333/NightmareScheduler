The Nightmare Scheduler program will let users input the times that they are available during the week and will come up with a time frame when everyone is available. There will be a simple GUI design, with three main buttons to start off with. The buttons will allow the user to
 1) enter in a new schedule
 2) see which schedules have already been entered to avoid losing track
 3) generate a timeframe that works with everyone's schedule
## Add Schedule Button 
When the button that adds a new schedule is clicked, the user will be prompted to enter in the person's name (this will be optional; if the user chooses not to add a name to the schedule, the third button that keeps track of the schedules that have already been entered will return blank) as well as the times that they are available. When all of the schedules have been added, the user can click the second button to generate a list of times during which everyone will be available. The new schedule button will create a new schedule for an individual, not for a group. To create a new schedule a group, the user could either press the Delete All button or exit from and restart the program.

## Sequence of Operations
When the program is launched, the user will first add a new schedule by pressing the corresponding button. They will keep pressing the button and adding a new schedule until they are satisfied that all schedules have been added (with the potential of deleting a schedule from the list, if they change their mind). Once they are satisfied with the list of schedules they have provided, they will press the Generate Time button to have the program determine the most suitable day and time for the specified group.

## Data
* The data will be entered by the user on program startup.  
* Data will not be saved to a file.  
* Data will consist of
  * Schedule Start Date
  * A list of player schedules
* Each player schedule will consist of
  * An optional player name
  * A list of days and times the player is available during the week starting on the schedule start date  

## Deleting A Schedule
There will be two buttons dealing with the deletion of a schedule. The first button will only delete one schedule at a time, and will be most useful if the user makes a mistake with schedule input or wants to remove someone from the schedule. The second button will delete all schedules that have been entered, and will be most useful when the user wants to completely start over, perhaps by figuring out an optimal time for a new group without having to exit and restart the program.
