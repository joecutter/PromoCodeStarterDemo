# quickbusdemo

## RUN
    1. Import the .sql file into your myqsl database
    2. run the application
    3. Ensure you have internet. Since there are some packages that will be install

## APIS
There are 5 endpoints defined:-
 # 1. /promo/generate/{amount}/{event}
    - Use this to generate new promocode. 
    - As proposed each promo will have a certain amount, hence bind each generated promo with an amount. thus replace {amount} with a figure(int value).
    - The {event} is to solve the problem of validity. So each newly created promocode will have a predefined destination when beign created.
    
 # 2. /promo/activate
    - This endpoint is to be used when Activating/Deactivating a promocode. Takes the model of the type:-
     {
     "requestType":"activated", //requesttype can be either "activated" or "deactivate"
     "req":"3PTEPX" // promocode 
     }
   
 # 3. /promo/activate/all
    - This endpoint returns all activated promo.
    
 # 4. /promo/all
    - This endpoint returns all promos. Either Activated or Deactivated.
    
 # 5. /promo/validateride
     - This endpoint is to be used when testing the validity of a promocode. Takes the model of the type:-
    {
      "origin":"Nakuru", //takes the origin
      "destination":"mombasa", //takes the destination
      "promocode":"GH1LSI" //takes the promocode
    }
    
    - if the destination doesnt match the predefined event/destination of the promocode. Error is returned!
