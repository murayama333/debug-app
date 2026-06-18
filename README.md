# debug-app — トラブルシュート演習

Spring Boot + Thymeleaf + MyBatis で作成したメッセージアプリをベースに、よくあるバグやセキュリティ上の問題を仕込んだ演習用リポジトリです。

## 技術スタック

- Java 25 / Spring Boot 4.1.0
- Thymeleaf（テンプレートエンジン）
- MyBatis（ORマッパー）
- MySQL（データベース）
- Lombok

## セットアップ

### 1. データベース作成

```sql
CREATE DATABASE todoapp;
USE todoapp;

CREATE TABLE message (
    id INT AUTO_INCREMENT PRIMARY KEY,
    content VARCHAR(255) NOT NULL,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);
```

### 2. アプリ起動

```bash
./mvnw spring-boot:run
```

`http://localhost:8080/messages` にアクセスしてください。

## 演習の進め方

### 1. mainブランチで正常動作を確認する

まず `main` ブランチでアプリを起動し、メッセージの一覧表示・登録が正常に動くことを確認してください。

### 2. 演習ブランチに切り替える

```bash
git switch exercise/01
```

### 3. バグを見つけて修正する

アプリを起動し、どのような不具合が起きるかを確認してください。
ソースコードを読み、原因を特定して修正してください。

### 4. 正解を確認する

```bash
git diff main
```

`main` ブランチとの差分が、仕込まれたバグの箇所です。

## 演習一覧

`exercise/01` 〜 `exercise/09` の全9問です。
