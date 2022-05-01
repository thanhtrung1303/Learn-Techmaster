# DATABASE Q&A

**Bảng câu hỏi**

```sql
CREATE TABLE question(
id INT PRIMARY KEY AUTO_INCREMENT,
question TEXT NOT NULL,
question_choice ENUM ('SINGLE', 'MULTI')
)
```

![image](https://user-images.githubusercontent.com/95046233/155837974-68dced65-9cb5-4c35-98ac-d47d631e41b3.png)

**Bảng trả lời**

```sql
CREATE TABLE answer(
id INT PRIMARY KEY AUTO_INCREMENT,
id_question INT NOT NULL,
content TEXT NOT NULL,
answer_check ENUM ('TRUE', 'FALSE'),
FOREIGN KEY (id_question) REFERENCES question (id)
)
```

![image](https://user-images.githubusercontent.com/95046233/155838004-71cb2eeb-9958-4378-9a93-dadccff3d521.png)

**Sơ đồ CSDL**

![image](https://user-images.githubusercontent.com/95046233/155838046-48b10344-17a4-437d-b982-99a036cdc9a0.png)
