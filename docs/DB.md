# AE情報教育を対象とした国分寺駅周辺のグルメ情報共有システムDB設計書

## 改版履歴
|日付|編集者|版数|変更履歴|
|---|-----|---|-------|
|2021.05.28|木村華|初版|初版作成|
|2021.06.02|木村華|二版|followを追加。それぞれのデータベースに対してid項目を追加。|

## データベース名　AE_DB
### users
|カラム名|項目名|概要|データ型|NULLを許容|PRI|DEFAULT|備考|
|-------|-----|---|-------|--------|---|--------|---|
|id|ユーザー識別ID|登録した順に自動的に入力される番号|INT|NO|○|NULL||
|userid|ユーザーID|数字8桁|INT|NO||NULL||
|names|ユーザー名|半角20文字まで|VARCHAR(20)|NO||NULL||
|pass|パスワード|半角20文字まで、ただし英数字をともに含む|VARCHAR(20)|NO||NULL||

### articles
|カラム名|項目名|概要|データ型|NULLを許容|PRI|DEFAULT|備考|
|-------|-----|---|-------|--------|---|--------|---|
|id|おすすめ情報ID|登録した順に自動的に入力される番号|INT|NO|○|NULL||
|titles|おすすめ情報投稿名|半角100文字まで|VARCHAR(100)|NO||NULL||
|names|お店の名前|半角100文字まで|VARCHAR(100)|NO||NULL||
|address|お店の住所|半角200文字まで|VARCHAR(200)|NO||NULL||
|comments|おすすめ情報|半角500文字まで|VARCHAR(500)|NO||NULL||
|user_id|ユーザーID|数字|INT|NO||NULL||

### comments
|カラム名|項目名|概要|データ型|NULLを許容|PRI|DEFAULT|備考|
|-------|-----|---|-------|--------|---|--------|---|
|id|コメントID|登録した順に自動的に入力される番号|INT|NO|○|NULL||
|titles|コメント投稿名|半角100文字まで|VARCHAR(100)|NO||NULL||
|comments|コメント情報|半角500文字まで|VARCHAR(500)|NO||NULL||
|user_id|ユーザーID|数字|INT|NO||NULL||
|user_names|ユーザー名|半角20文字まで|VARCHAR(20)|NO||NULL||
|article_id|おすすめ情報ID|おすすめ情報を登録した順に自動的に入力される番号|INT|NO||NULL||

### evaluations
|カラム名|項目名|概要|データ型|NULLを許容|PRI|DEFAULT|備考|
|-------|-----|---|-------|--------|---|--------|---|
|like|高評価|高評価した場合はtrue,そうでなければfalse|boolean|NO||false||
|dis|低評価|低評価した場合はtrue,そうでなければfalse|boolean|NO||false||
|user_id|ユーザーID|数字|INT|NO||NULL||
|article_id|おすすめ情報ID|登録した順に自動的に入力される番号|INT|NO||NULL||

### follow
|カラム名|項目名|概要|データ型|NULLを許容|PRI|DEFAULT|備考|
|-------|-----|---|-------|--------|---|--------|---|
|user_id|ユーザーID|数字|INT|NO||NULL||
|user_id_follow|フォローされた人のユーザーID|数字|INT|NO||NULL||
