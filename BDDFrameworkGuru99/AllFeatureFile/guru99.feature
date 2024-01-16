Feature: test guru99 website

  Scenario Outline: Registration validation
    Given user on regestor page
    When enter valid "<firstname>","<lastname>","<phno>","<mailid>","<address>","<cityname>","< statename>","<postcode>","<countryname>","<username>","<password>" and "<cpassword>" and submit

    Examples: 
      | firstname | lastname | phno       | mailid            | address  | cityname | statename   | postcode | countryname | username          | password    | cpassword   |
      | nilam     | sonawane |  656780456 | nilam@gmail.com   | baramati | pune     | maharashtra |   413102 | INDIA       | nilam@gmail.com   | Nilam@123   | Nilam@123   |
      | sangram   | pawar    | 6885999900 | sangram@gmail.com | baramati | pune     | maharashtra |   413193 | INDIA       | sangram@gamil.com | Sangram@123 | Sangram@123 |
