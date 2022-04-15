# Assignment3_WebProgramming
## Third assignment of the university course "Introduction to Web Programming (2022)"

Part 1

A site has a welcome message (mot of the day) which is changed every day a
care of the administrator.
A URL calls up a page in which the user can enter if recognized. If it doesn't come
recognized, the page requires username and password (admin, nimda). Credentials not
valid ones report the error to the user, if valid they give access to a page that allows
see the current welcome phrase, and replace it with another phrase.
A validated user can return to the same page within 10 minutes without having to
resubmit username and password.

Part 2

The site contains other pages accessible without validation.
A home page contains links to three pages:
- The administration one
- One that gives the hour
- One that gives the date
All four pages show the welcome phrase.
The pages that give the date and time must be built according to the MVC pattern, using
an access servlet that builds a bean containing the data and calls a JSP for the
presentation (which obviously reads the data from the bean).
