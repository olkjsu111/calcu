# Android Calculator Application (Calcu)

Một ứng dụng máy tính cơ bản được phát triển trên nền tảng Android sử dụng Java và Android Gradle Plugin (Kotlin DSL).

## 📱 Yêu cầu hệ thống & Môi trường phát triển
- Android Studio (Koala / Ladybug hoặc mới hơn)
- JDK 17 hoặc 21
- Gradle Plugin tương thích

## 🚀 Hướng dẫn cài đặt & Chạy ứng dụng
1. Clone repository về máy:
   ```bash
   git clone https://github.com/olkjsu111/calcu.git
   ```
2. Mở thư mục dự án bằng **Android Studio**.
3. Chờ Gradle sync hoàn tất các dependencies.
4. Chọn thiết bị giả lập (Emulator) hoặc thiết bị thật đã bật USB Debugging.
5. Nhấn nút **Run (Shift + F10)** để build và khởi chạy ứng dụng.

## 📂 Cấu trúc thư mục chính
```
cal/
├── app/                  # Mã nguồn chính của ứng dụng
│   ├── src/main/java/    # Java code (MainActivity.java)
│   └── src/main/res/     # Layouts, drawables, values
├── gradle/               # Gradle wrapper
├── build.gradle.kts      # Project level build script
└── settings.gradle.kts   # Project settings
```
