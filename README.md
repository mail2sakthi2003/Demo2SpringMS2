# DemoSpringMS2

This Project contains Saving  and retrieving Claim.
Each claim got  "memberId". The getClaim service will fetch the Person Details by calling another Microservice -PersonService from the DemoSpring Repository. 

# SaveClaim service

Post Request:
{
   "claimNo":"CL123",
   "claimDet":"Hospital",
   "claimType":"Inpatient",
   "memberId":"3"
}

Post response:
{
    "claimDet": "Hospital",
    "claimNo": "CL123",
    "claimId": 1,
    "claimType": "Inpatient",
    "memberId": "3"
}
