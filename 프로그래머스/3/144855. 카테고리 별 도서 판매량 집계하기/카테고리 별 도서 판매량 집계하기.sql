-- 코드를 입력하세요
select b.category, sum(bs.sales) as total_sales 
from book_sales as bs left join book as b 
on b.book_id = bs.book_id 
where bs.sales_date between '2022-01-01' AND '2022-01-31'
group by b.category having sum(bs.sales) > 0
order by category;