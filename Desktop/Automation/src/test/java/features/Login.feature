Feature: Application Login


Scenario: Home page default login 
Given User is on NetBanking landing page
When User login into application with "<username>" and password "<password>"
Then Homepage is populated
And Cards displayed are "true"

#Scenario: Home page default login 
#Given User is on NetBanking landing page
#When User login into application with "John" and password "4321" 
#Then Homepage is populated
#And Cards displayed are "false"


    | username   | password |

    | testuser_1 | Test@153 |

    | testuser_2 | Test@153 |