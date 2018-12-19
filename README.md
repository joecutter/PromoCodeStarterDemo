# quickbusdemo

## APIS
There are 5 endpoints defined:-
 # 1. /promo/generate/{amount}
    - Use this to generate new promocode. As proposed each promo will have a certain amount, hence bind each generated promo will an amount. thus replace {amount} will a figure.
 # 2. /promo/activate
   - This endpoint is to be used when Activating/Deactivating a promocode. Takes the model of the type:-
     {
     "requestType":"activated", //requesttype can be either activated or deactivate
     "req":"3PTEPX" // promocode 
     }
   
 # 3. /promo/activate/all
  - This endpoint returns all activated promo
 # 4. /promo/all
  - This endpoint returns all promos. Either Activated or Deactivated.
 # 5. /promo/setDestination
   - This endpoint is to be used when testing the validity of a promocode. Takes the model of the type:-
   {
     "origin":"Nakuru", //takes the origin
     "destination":"mombasa", //takes the destination
     "promocode":"GH1LSI" //takes the promocode
  }
