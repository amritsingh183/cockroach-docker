# Generated by Django 3.1 on 2020-08-13 18:32

# pylint: disable=C0103,C0114,E0611,C0115,E1101

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Customers',
            fields=[
                ('id', models.AutoField(primary_key=True, serialize=False)),
                ('name', models.CharField(max_length=250)),
            ],
        ),
        migrations.CreateModel(
            name='Products',
            fields=[
                ('id', models.AutoField(primary_key=True, serialize=False)),
                ('name', models.CharField(max_length=250)),
                ('price', models.DecimalField(decimal_places=2, max_digits=18)),
            ],
        ),
        migrations.CreateModel(
            name='Orders',
            fields=[
                ('id', models.AutoField(primary_key=True, serialize=False)),
                ('subtotal', models.DecimalField(decimal_places=2, max_digits=18)),
                ('customer', models.ForeignKey(null=True,
                                               on_delete=django.db.models.deletion.CASCADE,
                                               to='myproject.customers')),
                ('product', models.ManyToManyField(to='myproject.Products')),
            ],
        ),
    ]