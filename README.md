# Explicit Intent Android Navigation Application

An Android application demonstrating navigation between multiple activities using **Explicit Intents**, built according to **Problem Statement 4**.

---

## 📌 Problem Statement 4

> **The app should have two activities each having a separate button. Upon clicking on the button of first activity, second activity should open and upon clicking on the button of second activity, first activity should be displayed.**  
> **Expected Output:** Navigation between activities using explicit intent.

---

## 🚀 Key Features

1. **Two Distinct Activities:**
   - **`FirstActivity`**: Source activity with a button to initiate explicit navigation.
   - **`SecondActivity`**: Destination activity with a return button.
2. **Explicit Intent Implementation:**
   - `Intent intent = new Intent(FirstActivity.this, SecondActivity.class);`
   - Explicitly designates the target component class.
3. **Smooth Stack Handling:**
   - `SecondActivity` returns cleanly to `FirstActivity` using `FLAG_ACTIVITY_CLEAR_TOP` / `finish()`.
4. **Interactive Web Simulation:**
   - Live web preview deployed on Vercel simulating the smartphone experience with slide transitions and code documentation.

---

## 📂 Project Structure

```
ExplicitIntentApp/
├── app/
│   ├── build.gradle
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml
│           ├── java/com/example/explicitintentapp/
│           │   ├── FirstActivity.java
│           │   └── SecondActivity.java
│           └── res/
│               ├── drawable/
│               │   ├── badge_activity_one.xml
│               │   ├── badge_activity_two.xml
│               │   ├── button_activity_one.xml
│               │   ├── button_activity_two.xml
│               │   ├── card_background.xml
│               │   └── code_background.xml
│               ├── layout/
│               │   ├── activity_first.xml
│               │   └── activity_second.xml
│               └── values/
│                   ├── colors.xml
│                   ├── strings.xml
│                   └── styles.xml
├── build.gradle
├── gradle.properties
├── settings.gradle
├── index.html
└── README.md
```

---

## ⚙️ Core Implementation

### 1. Navigating from FirstActivity to SecondActivity

```java
// Inside FirstActivity.java
btnGoToSecond.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        // Explicit Intent explicitly declaring SecondActivity.class
        Intent explicitIntent = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(explicitIntent);
    }
});
```

### 2. Returning from SecondActivity to FirstActivity

```java
// Inside SecondActivity.java
btnReturnFirst.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        // Explicit Intent returning to FirstActivity.class
        Intent returnIntent = new Intent(SecondActivity.this, FirstActivity.class);
        returnIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(returnIntent);
        finish();
    }
});
```

### 3. AndroidManifest Declaration

```xml
<activity
    android:name=".FirstActivity"
    android:exported="true"
    android:label="@string/first_activity_title">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>

<activity
    android:name=".SecondActivity"
    android:exported="false"
    android:label="@string/second_activity_title" />
```

---

## 🛠️ How to Run in Android Studio

1. Open Android Studio.
2. Select **Open** and select `/ExplicitIntentApp`.
3. Allow Gradle to sync dependencies.
4. Click **Run 'app'** (Shift + F10) on an emulator or physical device.
