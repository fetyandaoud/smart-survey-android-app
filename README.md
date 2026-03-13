
# Smart Survey App (SurveyAppStarter)

This is a starter project for "Smart Survey," a modern, mobile-first survey platform built with Kotlin and Jetpack Compose. This repository demonstrates the core UI and navigation for both the user and admin flows, with a focus on a robust admin-side survey creation and editing experience.

---

## Implemented Features

* **Role-Based Navigation:** A central login screen routes to separate **Admin** and **User** dashboards.
* **Admin Survey Management:** A "collapsed" list view (`AddSurveyCollapsedScreen`) for viewing all questions in a survey.
* **Dynamic Question Editors:**
    * **MCQ Editor:** A full-featured modal bottom sheet (`EditQuestionMcqScreen`) for creating and editing Multiple Choice questions.
    * **Scale Editor:** A modal bottom sheet (`EditQuestionScaleScreen`) for creating and editing Scale-based questions.
* **Survey Runner:** A functional, step-by-step UI (`SurveyRunnerScreen`) for users to take and complete a survey.
* **State Management:** Follows modern MVVM patterns, using `ViewModel` (`AdminCreationVm`, `SurveyVm`) to manage UI state and handle business logic.

---

## Tech Stack

* **UI:** 100% Jetpack Compose (Material 3)
* **Language:** 100% Kotlin
* **Navigation:** Jetpack Navigation for Compose
* **Architecture:** MVVM
* **Data:** A local-first `FakeRepo` object acts as a stand-in for a real backend, demonstrating how the app would function with a live data source.

---

## How to Run

1.  Clone the repository.
2.  Open the project in the latest version of Android Studio.
3.  Run a **Build > Clean Project** followed by **Build > Rebuild Project**.
4.  Run the app on an emulator or a physical device.

---

## Project Status

**Current:** The core admin and user UI flows are built and functional. The app successfully launches, and all data models (`Question`, `QuestionState`) are aligned between the editors, ViewModels, and UI screens.

**Next Steps:**
* Replace `FakeRepo.kt` with a real backend (e.g., Firebase Firestore).
* Implement real user authentication.
* Build out the "Send Reminders" and "Past Surveys" features for the admin dashboard.
```
