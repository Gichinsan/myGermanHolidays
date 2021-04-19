# myGermanHolidays

MyGermanHolidays ist in der Lage Feste und bewegliche Feiertage aus Deutschland zu berechnen. Man kann einzelne
Feiertage abfragen oder sich pro Monat die Arbeitstage wiedergeben lassen. Alle Abfragen sind REST abfragen.

**Anmerkung:**

Es handelt sich um gesetzliche Feiertage innerhalb Deutschlands.

## Deploy to development server

mvnw wagon:upload-single@upload-to-myserver

## API Dokumentation

---

## **Aschermittwoch**

---

* **URL**

  `/v1/aschermittwoch`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-02-17T23: 00`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/aschermittwoch?year=2021```

## **Palmsonntag**

---

* **URL**

  `/v1/palmsonntag`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-03-27T23: 00`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/palmsonntag?year=2021```

## **Karfreitag**

---

* **URL**

  `/v1/karfreitag`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-04-02T00: 00`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/karfreitag?year=2021```

## **Ostersonntag**

---

* **URL**

  `/v1/ostersonntag`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-04-04T00: 00`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/ostersonntag?year=2021```

## **Ostermontag**

---

* **URL**

  `/v1/ostermontag`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-04-05T00: 00`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/ostermontag?year=2021```

## **ChristiHimmelfahrt**

---

* **URL**

  `/v1/christiHimmelfahrt`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-05-13T00: 00`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/christiHimmelfahrt?year=2021```

## **Pfingsten**

---

* **URL**

  `/v1/pfingsten`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-05-24T00: 00`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/pfingsten?year=2021```

## **Fronleichnam**

---

* **URL**

  `/v1/fronleichnam`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-06-03T00: 00`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/fronleichnam?year=2021```

## **MaiFeiertage**

---

* **URL**

  `/v1/maifeiertag`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-05-01`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/maifeiertag?year=2021```

## **Arbeitstage**

---

* **URL**

  `/v1/calcDayofMonth`

* **Method:**

  `GET`

* **URL Params**

    * `value = "year"`
    * `value = "month"`


* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `19`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/calcDayofMonth?year=2021&month=1```

## **HeiligeDreiKönige**

---

* **URL**

  `/v1/heilige`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-01-06`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/heilige?year=2021```

## **Neujahr**

---

* **URL**

  `/v1/neujahr`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-01-01

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/neujahr?year=2021```

## **Tag der Deutschen Einheit**

---

* **URL**

  `/v1/tagderDeutschenEinheit`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-10-03`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/tagderDeutschenEinheit?year=2021```

## **Weihnachten**

---

* **URL**

  `/v1/weihnachten`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-12-24`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/weihnachten?year=2021```

## **1. Weihnachtsfeiertag**

---

* **URL**

  `/v1/1Weihnachten`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-12-25`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/1Weihnachten?year=2021```

## **2. Weihnachtsfeiertag**

---

* **URL**

  `/v1/2Weihnachten`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-12-26`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/2Weihnachten?year=2021```

## **Silvester**

---

* **URL**

  `/v1/silvester`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-12-31`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/silvester?year=2021```


## **Allerheiligen**

---

* **URL**

  `/v1/allerheiligen`

* **Method:**

  `GET`

* **URL Params**

  `value = "year"`

* **Data Params**

  `None`

* **Success Response:**

* **Code:** 200 <br />
  **Content:** `2021-11-01`

* **Error Response:**

* **Code:** 404 Not Found <br />
  **Content:** `Not Found`

* **Sample Call:**

  ```http://localhost:8889/v1/allerheiligen?year=2021```